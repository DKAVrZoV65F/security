# 🔐 Spring Boot JWT Аутентификация

![Java](https://img.shields.io/badge/Java-21-orange?style=flat&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0%2B-brightgreen?style=flat&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?style=flat&logo=postgresql)
![Security](https://img.shields.io/badge/Security-JWT-black?style=flat&logo=jsonwebtokens)

Современная система аутентификации на основе Spring Security 6 и JSON Web Tokens. Реализует безопасную регистрацию/авторизацию пользователей с ролевой моделью доступа.

## 🚀 Используемые технологии

- **Java 21**
- **Spring Boot 3.5.4**
- **Spring Security 6** + JWT
- **PostgreSQL** - база данных
- **Lombok** - уменьшение boilerplate кода
- **Maven** - управление зависимостями

## 📦 Структура проекта

```
src/
├── main/
│   ├── java/org/spring/security/
│   │   ├── config/          🔧 Конфигурация безопасности
│   │   ├── controller/      🌐 REST endpoints
│   │   ├── entity/          🗄️ Сущности базы данных
│   │   ├── repository/      📦 Слой доступа к данным
│   │   └── service/         ⚙️ Бизнес-логика
│   └── resources/
│       └── application.yml  ⚙️ Конфигурация
```

## ⚙️ Предварительные требования

- Java 21 JDK
- PostgreSQL 15+
- Maven 3.9+

## 🛠️ Установка и настройка

1. **Клонируйте репозиторий**
   ```bash
   git clone https://github.com/DKAVrZoV65F/security.git
   cd spring-jwt-auth
   ```

2. **Настройте базу данных**
   ```sql
   CREATE DATABASE security;
   CREATE USER pguser WITH PASSWORD 'mypassword';
   GRANT ALL PRIVILEGES ON DATABASE security TO pguser;
   ```

3. **Установите переменную окружения**
   ```bash
   export SECRET_KEY="ваш-256-битный-секретный-ключ"
   ```

4. **Запустите приложение**
   ```bash
   mvn spring-boot:run
   ```

## 📡 API Endpoints

| Метод | Эндпоинт | Описание |
|--------|----------|-------------|
| `POST` | `/api/v1/auth/register` | 👥 Регистрация пользователя |
| `POST` | `/api/v1/auth/authenticate` | 🔑 Авторизация пользователя |
| `GET` | `/api/v1/demo-controller` | 🚀 Защищенный endpoint |

### 🔐 Примеры запросов

**Регистрация пользователя:**
```bash
curl -X POST http://localhost:8080/api/v1/auth/register \
  -H "Content-Type: application/json" \
  -d '{
    "firstName": "Иван",
    "lastName": "Иванов",
    "email": "ivan@example.com",
    "password": "securePassword123"
  }'
```

**Авторизация:**
```bash
curl -X POST http://localhost:8080/api/v1/auth/authenticate \
  -H "Content-Type: application/json" \
  -d '{
    "email": "ivan@example.com",
    "password": "securePassword123"
  }'
```

**Доступ к защищенному маршруту:**
```bash
curl -X GET http://localhost:8080/api/v1/demo-controller \
  -H "Authorization: Bearer ВАШ_JWT_ТОКЕН"
```

## 🔒 Функции безопасности

- ✅ Шифрование паролей с помощью BCrypt
- ✅ Валидация JWT токенов
- ✅ Stateless управление сессиями
- ✅ Ролевая авторизация
- ✅ Безопасное хранение паролей

## 🎯 Ключевые компоненты

- `JwtAuthenticationFilter` - 🛂 Проверяет JWT токены
- `JwtService` - 🏭 Генерирует и проверяет токены
- `AuthenticationProvider` - 🔐 Кастомная логика аутентификации
- `UserDetailsService` - 👤 Интеграция со Spring Security

---

## 📄 Лицензия

Этот проект создан в учебных целях.
