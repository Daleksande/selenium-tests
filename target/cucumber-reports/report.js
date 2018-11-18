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
  "duration": 14563349065,
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
  "name": "подтвержден регион",
  "keyword": "* "
});
formatter.step({
  "line": 8,
  "name": "выбран пункт меню \"Страхование\"",
  "keyword": "* "
});
formatter.match({
  "location": "MainSteps.acceptRegion()"
});
formatter.result({
  "duration": 716849772,
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
  "duration": 357200071,
  "status": "passed"
});
formatter.after({
  "duration": 1007219186,
  "status": "passed"
});
});