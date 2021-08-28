import java.util.Scanner;

public class ConsoleApp {
    public void consoleApp(Cart cart) {
        boolean cont = true;
        while (cont) {
            System.out.println("Для добавления в корзину введите 1");
            System.out.println("Для удалление из корзины введите 2");
            System.out.println("Чтобы закончить введите 3");

            Scanner scanner = new Scanner(System.in);
            String msg = scanner.nextLine();
            switch (msg) {
                case "1":
                    System.out.println("Введите id товара");
                    try {
                        if (cart.addToCart(Integer.parseInt(scanner.nextLine()))) {
                            System.out.println("Товар успешно добавлен");
                        } else {
                            System.out.println("Такого товара нет в наличии");
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат ID");
                        break;
                    }

                case "2":
                    System.out.println("Введите id товара");
                    try {
                        if (cart.removeFromCart(Integer.parseInt(scanner.nextLine()))) {
                            System.out.println("Товар успешно удален");
                        } else {
                            System.out.println("Такого товара нет в корзине");
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат ID");
                        break;
                    }
                case "3":
                    cont = false;
                    break;
                default:
                    System.out.println("Такая возможность не предусмотрена");
            }
        }
    }
}
