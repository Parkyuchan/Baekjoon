import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String[] asem = br.readLine().split(" ");
            String result = "";

            if (asem[0].equals("ADD"))
                result += "000000";
            if (asem[0].equals("ADDC"))
                result += "000010";
            if (asem[0].equals("SUB"))
                result += "000100";
            if (asem[0].equals("SUBC"))
                result += "000110";
            if (asem[0].equals("MOV"))
                result += "001000";
            if (asem[0].equals("MOVC"))
                result += "001010";
            if (asem[0].equals("AND"))
                result += "001100";
            if (asem[0].equals("ANDC"))
                result += "001110";
            if (asem[0].equals("OR"))
                result += "010000";
            if (asem[0].equals("ORC"))
                result += "010010";
            if (asem[0].equals("NOT"))
                result += "010100";
            if (asem[0].equals("MULT"))
                result += "011000";
            if (asem[0].equals("MULTC"))
                result += "011010";
            if (asem[0].equals("LSFTL"))
                result += "011100";
            if (asem[0].equals("LSFTLC"))
                result += "011110";
            if (asem[0].equals("LSFTR"))
                result += "100000";
            if (asem[0].equals("LSFTRC"))
                result += "100010";
            if (asem[0].equals("ASFTR"))
                result += "100100";
            if (asem[0].equals("ASFTRC"))
                result += "100110";
            if (asem[0].equals("RL"))
                result += "101000";
            if (asem[0].equals("RLC"))
                result += "101010";
            if (asem[0].equals("RR"))
                result += "101100";
            if (asem[0].equals("RRC"))
                result += "101110";

            String check = "";


            // rD
            for (int j = 0; j < 3; j++) {
                if(asem[1].equals("0")) {
                    check = "0" + check;
                    continue;
                }

                check = Integer.parseInt(asem[1]) % 2 + check;
                asem[1] = String.valueOf(Integer.parseInt(asem[1]) / 2);
            }

            result += check;

            check = "";


            // rA
            if (asem[0].equals("MOV") || asem[0].equals("MOVC") || asem[0].equals("NOT"))
                result += "000";
            else {
                for (int j = 0; j < 3; j++) {

                    if(asem[2].equals("0")) {
                        check = "0" + check;
                        continue;
                    }

                    check = Integer.parseInt(asem[2]) % 2 + check;
                    asem[2] = String.valueOf(Integer.parseInt(asem[2]) / 2);
                }
                result += check;
            }

            check = "";

            //rB
            if (asem[0].contains("C")) {
                for (int j = 0; j < 4; j++) {

                    if(asem[3].equals("0")) {
                        check = "0" + check;
                        continue;
                    }

                    check = Integer.parseInt(asem[3]) % 2 + check;
                    asem[3] = String.valueOf(Integer.parseInt(asem[3]) / 2);
                }
            } else {
                for (int j = 0; j < 3; j++) {

                    if(asem[3].equals("0")) {
                        check = "0" + check;
                        continue;
                    }

                    check = Integer.parseInt(asem[3]) % 2 + check;
                    asem[3] = String.valueOf(Integer.parseInt(asem[3]) / 2);

                }

                check += "0";
            }
            result += check;

            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

}
