#language: ru
Функционал: Страхование

#  @web
  Сценарий: Оформление страховки

    * загружена страница "MainPage"
    * подтвержден регион
    * выбран пункт меню "Страхование"
    * выполнено нажатие на "В путешествие"
    * загружена страница "VbcPage"
    * выполнено нажатие на "Оставить заявку"
    * проверяю, что элемент "Заголовок" содержит текст "Форма заявки на страховую программу"
    * проверяю, что элемент "Продукт" содержит текст "Вояж (Комфорт/Бизнес класс/Первый класс)"
    * поле "Фамилия" заполняется значением "Волынин"
    * поле "Имя" заполняется значением "Илья"
    * поле "Отчество" заполняется значением "Павлович"
    * поле "Дата рождения" заполняется значением "01.01.1986"
    * поле "Номер телефона" заполняется значением "9031234567"
    * поле "Электронная почта" заполняется значением "test@test.ru"
    * поле "Проверочный код" заполняется значением "test"
    * выполнено нажатие на "Согласие на обработку данных"
    * проверяю, что элемент "Отправить" доступен