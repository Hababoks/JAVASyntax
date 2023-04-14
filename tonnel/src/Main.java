public class Main {
    public static void main(String[] args) {
        String bug = "🐛";
        String robot = "🤖";
        String land = "🌍";
        String death = "💀";
        String hole = " ";


            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 10; j++) {
                    if (j == 3) {
                        System.out.print(hole); // вывод тоннеля на 4-й позиции
                    } else {
                        System.out.print(land); // вывод земли
                    }
                }
                System.out.println();
            }

            for (int j = 0; j < 10; j++) {
                System.out.print(death); // вывод зараженных роботов
            }
            System.out.println();
        }
    }









