package NMeetingInOneRoom;
import java.util.*;

public class Solution{
    //This class is for creating a DS for meeting
    public static class Meeting{
        int start;
        int end;
        int pos;
        Meeting(int start, int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    //This is comparator of sorting the ds according to end times of the meeting
    public static class meetingComparator implements Comparator<Meeting>{
        @Override
        public int compare(Meeting o1, Meeting o2){
            if(o1.end < o2.end){
                return -1;
            }else if(o1.end > o2.end){
                return 1;
            }else if(o1.pos < o2.pos){
                return -1;
            }
            return 1;
        }
    }

    //This method finds the maximum number of meetings that can be conducted
    public static int maxMeetings(int start[], int end[], int n){
        /*
         * Create a data sctructure of Meet (Class is defined above)
         * Add start, end, pos of the meeting the ds respectively
         */
        ArrayList<Meeting> meet = new ArrayList<>();//Creating a ds
        for(int i = 0; i < start.length; i++){//Adding to ds
            meet.add(new Meeting(start[i], end[i], i+1));
        }

        //Sorting the ds with the help of the comparators
        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);

        //Counting the possible meetings in the room
        ArrayList<Integer> li = new ArrayList<>();
        li.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i = 1; i < start.length; i++){
            if(meet.get(i).start > limit){
                li.add(meet.get(i).pos);
                limit = meet.get(i).end;
            }
        }

        //returning the number of possible meetings
        return li.size();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Number of meetings
        int start[] = new int[n];//Start time of the meeting here
        int end[] = new int[n];//End time of the meeting here

        //Taking the starting times of the meetings
        for(int i = 0; i < start.length; i++){
            start[i] = sc.nextInt();
        }

        //Taking the ending times of the meetings
        for(int i = 0; i < end.length; i++){
            end[i] = sc.nextInt();
        }

        //Passing the timings to the method
        int res = maxMeetings(start, end, n);
        System.out.println(res);
    }
}
