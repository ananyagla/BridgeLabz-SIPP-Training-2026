import java.util.ArrayList;

public class EmployeeSkillAssignmentRecursion {
    static void findTeams(int[] arr, int index, int target,
                          ArrayList<Integer> current) {

        if (target == 0) {
            System.out.println(current);
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        
        current.add(arr[index]);
        findTeams(arr, index + 1, target - arr[index], current);

        
        current.remove(current.size() - 1);
        findTeams(arr, index + 1, target, current);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7};
        int target = 10;

        findTeams(arr, 0, target, new ArrayList<>());
    }
    
}
