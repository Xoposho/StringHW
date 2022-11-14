public class Main {
    public static void main(String[] args) {

        //Task 1
        String firstName = "Семён";
        String middleName = "Иванов";
        String lastName = "Семёнович";
        String fullName = middleName + " " + firstName + " " + lastName;

        System.out.println(fullName);

        //Task 2
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);

        //Task 3
        String fullNameReplaceYo = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameReplaceYo);
    }
}