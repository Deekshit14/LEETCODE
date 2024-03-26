package STRINGS;

public class Robot_Return_to_Origin {
    public static void main(String[] args) {
        // String moves = "LL";
        String moves = "LRUD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int UpDown = 0;
        int LeftRight = 0;

        for (char c : moves.toCharArray() )
        {
            if (c == 'U')
                UpDown++;
            else if (c == 'D')
                UpDown--;
            else if (c == 'R')
                LeftRight++;
            else if (c == 'L')
                LeftRight--;
        }
        return (LeftRight == 0 && UpDown == 0);
    }
    
    // public static boolean judgeCircle(String moves) {
        //         int u=0, d=0, l=0, r=0;
        //         for (int i=0; i<moves.length();i++)
        //         {
        //             if (moves.charAt(i) == 'U')
        //                 u++;
        //             if (moves.charAt(i) == 'D')
        //                 d++;
        //             if (moves.charAt(i) == 'R')
        //                 r++;
        //             if (moves.charAt(i) == 'L')
        //                 l++;
        //         }
        //         return (u==d && r==l);
        //     }
}
