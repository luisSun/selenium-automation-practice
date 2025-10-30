# 🧪 Testes UI com Selenium WebDriver

> Testes automatizados da aplicação [OrangeHRM Demo](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login) usando **Selenium WebDriver**, Java e TestNG.  

![Java](https://img.shields.io/badge/Java-19-orange?logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.38.0-blue?logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-7.10.2-green)
![License](https://img.shields.io/badge/License-GPLv3-blue.svg)

---

## 🚀 Tecnologias Utilizadas

* ⚡ **Selenium WebDriver** — automação de navegador
* ☕ **Java 19** — linguagem de programação
* 📝 **TestNG** — framework de testes
* 🌐 **ChromeDriver** — driver do Chrome para Selenium
* 📦 **Maven** — gerenciamento de dependências

---

## ⚙️ Estrutura do Projeto

```

📦 selenium-tests
┣ 📜 FirstSeleniumTest.java    # Teste de login OrangeHRM
┣ 📜 pom.xml                   # Dependências do Maven

````

---

## 🧪 Testes Implementados

### 🔹 Login no OrangeHRM Demo

**Objetivo:** Validar login e acesso ao dashboard da aplicação.

```java
@Test
public void testLoginIntoApplication() throws InterruptedException {
    Thread.sleep(20000); // aguardando o carregamento da página

    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("Admin");

    var password = driver.findElement(By.name("password"));
    password.sendKeys("admin123");

    driver.findElement(By.tagName("button")).click();

    Thread.sleep(40000); // aguardando o dashboard carregar
    String actualResult = driver.findElement(By.tagName("h6")).getText();
    String expectedResult = "Dashboard";

    Assert.assertEquals(actualResult, expectedResult);
}
````

> ⚠️ Nota: Este teste foi feito **para treinar Selenium**, lidando com **iframe** e **tempos de carregamento elevados**, não sendo otimizado para produção.

---

## ⚙️ Como Executar Localmente

1️⃣ Certifique-se que o **ChromeDriver** está instalado e disponível no PATH.

2️⃣ Abra o projeto no IntelliJ IDEA (ou outro IDE com suporte a Maven).

3️⃣ Rodar teste pelo IntelliJ: execute `FirstSeleniumTest.java`.

4️⃣ Ou via terminal Maven:

```bash
mvn test
```

---
## ✍️ Autor

**Luis Fernando Afonso**
* 💼 Projeto de estudo — Automação de UI com Selenium WebDriver
* 📧 [luis.sun@gmail.com](mailto:luis.sun@gmail.com)

---

## 🧾 Licença

Este projeto é de uso livre para fins educacionais, licenciado sob a **GNU GENERAL PUBLIC LICENSE v3.0**.
