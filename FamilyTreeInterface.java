package Homework8;

import java.util.ArrayList;

public interface FamilyTreeInterface {
    String getPersonalId(); // Возвращает персональный ID человека.

    String getFatherId(); // Возвращает ID отца человека.

    String getMotherId(); // Возвращает ID матери человека.

    String getSexId(); // Возвращает пол человека.

    FamilyTree addToList(ArrayList<FamilyTree> family); // Добавление человека в дерево.

    void printAll(ArrayList<FamilyTree> family); // Вывод всего дерева в консоль.

    void printParent(ArrayList<FamilyTree> family); // Вывод родителей в консоль.

    void printBrotherSister(ArrayList<FamilyTree> family); // Вывод братьев или сестёр в консоль.

    void printChildrens(ArrayList<FamilyTree> family); // Вывод детей в консоль.

    void printGrandParent(ArrayList<FamilyTree> family); // Вывод дедушек или бабушек в консоль.

    void familyTreeToFile(ArrayList<FamilyTree> family); // Сохранение дерева в файл.
}
