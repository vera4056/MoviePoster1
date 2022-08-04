import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    public class MoviesManagerTest {
         @Test

        public void testAll() {

            MoviesManager manager = new MoviesManager();
            manager.add("Бладшот");
            manager.add("Вперёд");
            manager.add("Отель Белград");
            manager.add("Джентельиены");
            manager.add("Человек-неведимка");
            manager.add("Тролли");
            manager.add("Номер один");


            String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельиены", "Человек-неведимка", "Тролли", "Номер один"};
            String[] actual = manager.findAll();

            assertArrayEquals(expected, actual);
        }

        @Test

        public void testLast() {

            MoviesManager manager = new MoviesManager();
            manager.add("Бладшот");
            manager.add("Вперёд");
            manager.add("Отель Белград");
            manager.add("Джентельиены");
            manager.add("Человек-неведимка");
            manager.add("Тролли");
            manager.add("Номер один");


            String[] expected = {"Номер один", "Тролли", "Человек-неведимка", "Джентельиены", "Отель Белград", "Вперёд", "Бладшот"};
            String[] actual = manager.findLast();

            assertArrayEquals(expected, actual);
        }

        @Test

        public void testLast2() {

            MoviesManager manager = new MoviesManager(15);
            manager.add("Бладшот");
            manager.add("Вперёд");
            manager.add("Отель Белград");
            manager.add("Джентельиены");
            manager.add("Человек-неведимка");
            manager.add("Тролли");
            manager.add("Номер один");


            String[] expected = {"Номер один", "Тролли", "Человек-неведимка", "Джентельиены", "Отель Белград", "Вперёд", "Бладшот"};
            String[] actual = manager.findLast();

            assertArrayEquals(expected, actual);
        }

        @Test

        public void testLast3() {

            MoviesManager manager = new MoviesManager(5);
            manager.add("Бладшот");
            manager.add("Вперёд");
            manager.add("Отель Белград");
            manager.add("Джентельиены");
            manager.add("Человек-неведимка");
            manager.add("Тролли");
            manager.add("Номер один");


            String[] expected = {"Номер один", "Тролли", "Человек-неведимка", "Джентельиены", "Отель Белград"};
            String[] actual = manager.findLast();

            assertArrayEquals(expected, actual);
        }
    }


