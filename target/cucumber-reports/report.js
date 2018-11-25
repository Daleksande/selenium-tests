$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("insurance.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: ru"
    }
  ],
  "line": 2,
  "name": "Страхование",
  "description": "",
  "id": "страхование",
  "keyword": "Функционал"
});
formatter.before({
  "duration": 10641110332,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Оформление страховки",
  "description": "",
  "id": "страхование;оформление-страховки",
  "type": "scenario",
  "keyword": "Сценарий",
  "tags": [
    {
      "line": 4,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "загружена страница \"MainPage\"",
  "keyword": "* "
});
formatter.step({
  "line": 8,
  "name": "подтвержден регион",
  "keyword": "* "
});
formatter.step({
  "line": 9,
  "name": "выбран пункт меню \"Страхование\"",
  "keyword": "* "
});
formatter.step({
  "line": 10,
  "name": "выполнено нажатие на \"В путешествие\"",
  "keyword": "* "
});
formatter.step({
  "line": 11,
  "name": "загружена страница \"VbcPage\"",
  "keyword": "* "
});
formatter.step({
  "line": 12,
  "name": "выполнено нажатие на \"Оставить заявку\"",
  "keyword": "* "
});
formatter.step({
  "line": 13,
  "name": "проверяю, что элемент \"Заголовок\" содержит текст \"Форма заявки на страховую программу\"",
  "keyword": "* "
});
formatter.step({
  "line": 14,
  "name": "проверяю, что элемент \"Продукт\" содержит текст \"Вояж (Комфорт/Бизнес класс/Первый класс)\"",
  "keyword": "* "
});
formatter.step({
  "line": 15,
  "name": "поле \"Фамилия\" заполняется значением \"Волынин\"",
  "keyword": "* "
});
formatter.step({
  "line": 16,
  "name": "поле \"Имя\" заполняется значением \"Илья\"",
  "keyword": "* "
});
formatter.step({
  "line": 17,
  "name": "поле \"Отчество\" заполняется значением \"Павлович\"",
  "keyword": "* "
});
formatter.step({
  "line": 18,
  "name": "поле \"Дата рождения\" заполняется значением \"01.01.1986\"",
  "keyword": "* "
});
formatter.step({
  "line": 19,
  "name": "поле \"Номер телефона\" заполняется значением \"9031234567\"",
  "keyword": "* "
});
formatter.step({
  "line": 20,
  "name": "поле \"Электронная почта\" заполняется значением \"test@test.ru\"",
  "keyword": "* "
});
formatter.step({
  "line": 21,
  "name": "поле \"Проверочный код\" заполняется значением \"test\"",
  "keyword": "* "
});
formatter.step({
  "line": 22,
  "name": "выполнено нажатие на \"Согласие на обработку данных\"",
  "keyword": "* "
});
formatter.step({
  "line": 23,
  "name": "проверяю, что элемент \"Отправить\" доступен",
  "keyword": "* "
});
formatter.match({
  "arguments": [
    {
      "val": "MainPage",
      "offset": 20
    }
  ],
  "location": "ScenarioSteps.stepPageLoaded(String)"
});
formatter.result({
  "duration": 89081565,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.acceptRegion()"
});
formatter.result({
  "duration": 357023146,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Страхование",
      "offset": 19
    }
  ],
  "location": "MainSteps.selectMenuItem(String)"
});
formatter.result({
  "duration": 196253192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "В путешествие",
      "offset": 22
    }
  ],
  "location": "ScenarioSteps.click(String)"
});
formatter.result({
  "duration": 4171231802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VbcPage",
      "offset": 20
    }
  ],
  "location": "ScenarioSteps.stepPageLoaded(String)"
});
formatter.result({
  "duration": 60871,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Оставить заявку",
      "offset": 22
    }
  ],
  "location": "ScenarioSteps.click(String)"
});
formatter.result({
  "duration": 2839678328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Заголовок",
      "offset": 23
    },
    {
      "val": "Форма заявки на страховую программу",
      "offset": 50
    }
  ],
  "location": "ScenarioSteps.checkText(String,String)"
});
formatter.result({
  "duration": 224671410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Продукт",
      "offset": 23
    },
    {
      "val": "Вояж (Комфорт/Бизнес класс/Первый класс)",
      "offset": 48
    }
  ],
  "location": "ScenarioSteps.checkText(String,String)"
});
formatter.result({
  "duration": 104444378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Фамилия",
      "offset": 6
    },
    {
      "val": "Волынин",
      "offset": 38
    }
  ],
  "location": "ScenarioSteps.fillField(String,String)"
});
formatter.result({
  "duration": 177319469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Имя",
      "offset": 6
    },
    {
      "val": "Илья",
      "offset": 34
    }
  ],
  "location": "ScenarioSteps.fillField(String,String)"
});
formatter.result({
  "duration": 118945896,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Отчество",
      "offset": 6
    },
    {
      "val": "Павлович",
      "offset": 39
    }
  ],
  "location": "ScenarioSteps.fillField(String,String)"
});
formatter.result({
  "duration": 152555217,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Дата рождения",
      "offset": 6
    },
    {
      "val": "01.01.1986",
      "offset": 44
    }
  ],
  "location": "ScenarioSteps.fillField(String,String)"
});
formatter.result({
  "duration": 181032600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Номер телефона",
      "offset": 6
    },
    {
      "val": "9031234567",
      "offset": 45
    }
  ],
  "location": "ScenarioSteps.fillField(String,String)"
});
formatter.result({
  "duration": 194237623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Электронная почта",
      "offset": 6
    },
    {
      "val": "test@test.ru",
      "offset": 48
    }
  ],
  "location": "ScenarioSteps.fillField(String,String)"
});
formatter.result({
  "duration": 185033018,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Проверочный код",
      "offset": 6
    },
    {
      "val": "test",
      "offset": 46
    }
  ],
  "location": "ScenarioSteps.fillField(String,String)"
});
formatter.result({
  "duration": 119825965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Согласие на обработку данных",
      "offset": 22
    }
  ],
  "location": "ScenarioSteps.click(String)"
});
formatter.result({
  "duration": 111637395,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Отправить",
      "offset": 23
    }
  ],
  "location": "ScenarioSteps.checkIsEnabled(String)"
});
formatter.result({
  "duration": 30304082,
  "status": "passed"
});
formatter.after({
  "duration": 793071060,
  "status": "passed"
});
});