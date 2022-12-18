package Homework8;

import java.util.ArrayList;

public class IvanovFamily {
    public static void main(String[] args) {
        ArrayList<FamilyTree> family = new ArrayList<FamilyTree>();
        FamilyTree person1 = new FamilyTree("Иванов", "Алексей", "Иванович", "25.10.1995", "м", "1", "2", "3")
                .addToList(family);
        FamilyTree person2 = new FamilyTree("Иванов", "Антон", "Иванович",
                "02.09.1993", "м", "4", "2", "3").addToList(family);
        FamilyTree person3 = new FamilyTree("Иванов", "Иван", "Борисович", "09.04.1975", "м", "2", "5", "6")
                .addToList(family);
        FamilyTree person4 = new FamilyTree("Иванова", "Ольга", "Олеговна",
                "16.07.1977", "ж", "3", "7", "8").addToList(family);
        FamilyTree person5 = new FamilyTree("Иванов", "Борис", "Евгеньевич", "13.05.1944", "м", "5", "9", "10")
                .addToList(family);
        FamilyTree person6 = new FamilyTree("Иванова", "Ангелина", "Никитична",
                "05.01.1939", "ж", "6", "11", "12").addToList(family);
        FamilyTree person7 = new FamilyTree("Иванов", "Олег", "Витальевич", "09.04.1936", "м", "7", "13", "14")
                .addToList(family);
        FamilyTree person8 = new FamilyTree("Иванова", "Кристина", "Александровна",
                "14.07.1938", "ж", "8", "15", "16").addToList(family);
        person3.printParent(family);
        person1.printBrotherSister(family);
        person6.printChildrens(family);
        person2.printGrandParent(family);
        person4.printChildrens(family);
        person5.printChildrens(family);
        person7.printChildrens(family);
        person8.printChildrens(family);
        person1.printAll(family);
        person1.familyTreeToFile(family);
    }
}
