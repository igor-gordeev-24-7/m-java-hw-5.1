Задача 1: Создание иерархии исключений

Создайте собственную иерархию проверяемых (checked) и непроверяемых (unchecked) исключений.

BankException (проверяемое) - базовое исключение для всех проблем, связанных с банковскими операциями.

InsufficientFundsException (проверяемое, наследуется от BankException) - вызывается при попытке снять или перевести сумму, превышающую текущий баланс.

InvalidAmountException (непроверяемое, наследуется от RuntimeException) - вызывается при попытке выполнить операцию с суммой <= 0.

AccountNotFoundException (непроверяемое) - вызывается, если счет с указанным номером не существует.

Задача 2: Класс BankAccount

Создайте класс BankAccount со следующими полями и методами:

Поля:

accountNumber (String) - уникальный номер счета.

ownerName (String) - имя владельца.

balance (double) - текущий баланс.

Конструктор:

Принимает accountNumber, ownerName и начальный balance.

Если начальный баланс отрицательный, выбросить InvalidAmountException.

Методы:

deposit(double amount): Пополняет счет на указанную сумму.

Если amount <= 0, выбросить InvalidAmountException.

withdraw(double amount): Снимает указанную сумму со счета.

Если amount <= 0, выбросить InvalidAmountException.

Если amount > balance, выбросить InsufficientFundsException.

getBalance(): Возвращает текущий баланс.

Геттеры для полей.
