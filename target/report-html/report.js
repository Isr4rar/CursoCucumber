$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/inserir_conta.feature");
formatter.feature({
  "line": 1,
  "name": "Cadastro de contas",
  "description": "Como um usuário \nGostaria de cadastrar contas\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "cadastro-de-contas",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "informo a conta \"\u003cconta\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "seleciono Salvar",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "recebo a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;",
  "rows": [
    {
      "cells": [
        "conta",
        "mensagem"
      ],
      "line": 21,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;1"
    },
    {
      "cells": [
        "Conta de Teste",
        "Conta adicionada com sucesso!"
      ],
      "line": 22,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;2"
    },
    {
      "cells": [
        "",
        "Informe o nome da conta"
      ],
      "line": 23,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;3"
    },
    {
      "cells": [
        "Conta mesmo nome",
        "Já existe uma conta com esse nome!"
      ],
      "line": 24,
      "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "que estou acessando a aplicação",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "informo o usuário \"test@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "a senha \"123456\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "seleciono entrar",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "visualizo a página inicial",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "seleciono Contas",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "seleciono Adicionar",
  "keyword": "And "
});
formatter.match({
  "location": "InserirContasSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 4414876281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@gmail.com",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.informoOUsuário(String)"
});
formatter.result({
  "duration": 126668579,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 9
    }
  ],
  "location": "InserirContasSteps.aSenha(String)"
});
formatter.result({
  "duration": 73296179,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoEntrar()"
});
formatter.result({
  "duration": 621277835,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.visualizoAPáginaInicial()"
});
formatter.result({
  "duration": 559195954,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoContas()"
});
formatter.result({
  "duration": 66165315,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoAdicionar()"
});
formatter.result({
  "duration": 328337778,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "informo a conta \"Conta de Teste\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "seleciono Salvar",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "recebo a mensagem \"Conta adicionada com sucesso!\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Conta de Teste",
      "offset": 17
    }
  ],
  "location": "InserirContasSteps.informoAConta(String)"
});
formatter.result({
  "duration": 86159285,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoSalvar()"
});
formatter.result({
  "duration": 460369577,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta adicionada com sucesso!",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 71211064,
  "status": "passed"
});
formatter.after({
  "duration": 589978112,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "que estou acessando a aplicação",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "informo o usuário \"test@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "a senha \"123456\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "seleciono entrar",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "visualizo a página inicial",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "seleciono Contas",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "seleciono Adicionar",
  "keyword": "And "
});
formatter.match({
  "location": "InserirContasSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 8408998700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@gmail.com",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.informoOUsuário(String)"
});
formatter.result({
  "duration": 121074683,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 9
    }
  ],
  "location": "InserirContasSteps.aSenha(String)"
});
formatter.result({
  "duration": 79312108,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoEntrar()"
});
formatter.result({
  "duration": 811141192,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.visualizoAPáginaInicial()"
});
formatter.result({
  "duration": 569932297,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoContas()"
});
formatter.result({
  "duration": 67781504,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoAdicionar()"
});
formatter.result({
  "duration": 364043648,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "informo a conta \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "seleciono Salvar",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "recebo a mensagem \"Informe o nome da conta\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 17
    }
  ],
  "location": "InserirContasSteps.informoAConta(String)"
});
formatter.result({
  "duration": 64350196,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoSalvar()"
});
formatter.result({
  "duration": 274899843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Informe o nome da conta",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 79972389,
  "status": "passed"
});
formatter.after({
  "duration": 596736166,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "que estou acessando a aplicação",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "informo o usuário \"test@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "a senha \"123456\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "seleciono entrar",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "visualizo a página inicial",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "seleciono Contas",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "seleciono Adicionar",
  "keyword": "And "
});
formatter.match({
  "location": "InserirContasSteps.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 32892257058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@gmail.com",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.informoOUsuário(String)"
});
formatter.result({
  "duration": 108777198,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 9
    }
  ],
  "location": "InserirContasSteps.aSenha(String)"
});
formatter.result({
  "duration": 76012157,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoEntrar()"
});
formatter.result({
  "duration": 3504063482,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.visualizoAPáginaInicial()"
});
formatter.result({
  "duration": 563821418,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoContas()"
});
formatter.result({
  "duration": 64087482,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoAdicionar()"
});
formatter.result({
  "duration": 318226182,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Deve validar regras cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-cadastro-contas;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "informo a conta \"Conta mesmo nome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "seleciono Salvar",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "recebo a mensagem \"Já existe uma conta com esse nome!\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Conta mesmo nome",
      "offset": 17
    }
  ],
  "location": "InserirContasSteps.informoAConta(String)"
});
formatter.result({
  "duration": 93305295,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.selecionoSalvar()"
});
formatter.result({
  "duration": 304062026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Já existe uma conta com esse nome!",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.receboAMensagem(String)"
});
formatter.result({
  "duration": 73892674,
  "status": "passed"
});
formatter.after({
  "duration": 589993548,
  "status": "passed"
});
});