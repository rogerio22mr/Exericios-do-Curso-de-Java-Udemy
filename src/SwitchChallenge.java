public class SwitchChallenge {
    public static void main(String[] args) {
        char switchChar = 'C';

        switch (switchChar) {
            case 'A':case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;
            default:
                System.out.println("A, B, C, D or E not found");
        }
    }
}
