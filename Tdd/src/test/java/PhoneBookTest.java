import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();


    @Test //Тест на правильный номер
    public void testAdd1() {
        //arrange
        int expected;
        int actual = 2;
        //act
        phoneBook.add("+79315851646", "Oleg");
        phoneBook.add("+79315851647", "Oleg");
        expected = phoneBook.add("+79315851646", "Oleg");
        //assert
        if (actual == expected) {
            System.out.println("Тест на правильный номер пройден");
        } else
            throw new AssertionError("Тест на правильный номер не пройден");
    }
    @Test //Тест на поиск имени по номеру телефона
    public void testFindByNumber () {
        //Arrange
        phoneBook.add("+79315851646", "Oleg");
        phoneBook.add("+79315851647", "Vasya");
        phoneBook.add("+79315851648", "Petya");
        String actual = "Petya";
        //Act
        String expected = phoneBook.findByNumber("+79315851648");
        //Assert
        if (actual.equals(expected)) {
            System.out.println("Тест на поиск имени по номеру пройден");
        } else
            throw new AssertionError("Тест на поиск имени по номеру не пройден");
    }
}
