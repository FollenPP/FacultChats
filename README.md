# FacultChats Техническое задание. 

-Реализовать аутентификацию с последующим занесением пользователя в базу данных на сервере Firebase  (https://firebase.google.com/) 

-Для основного меню использовать патерн Basic activity. 
 

-Соответственно для реализации чат комнаты нужно использовать API и библиотеки Firebase . 

-Карта google_maps с отображением местоположения пользователей данной чат комнаты и кастомным маркером (аватаром текущего пользователя). 

-Реализовать метод, открывающий карту непосредственно на место положении текущего пользователя. 

-Реализовать метод сохранения текущих координат пользователя в базе данных Firebase. 

-Реализовать метод сохранения чат комнат и списки пользователей в базе данных Firebase. 

-Возможность смены аватарки пользователя. 

 

Меню: 

-Список чат комнат. 

-Настройка профиля. 

-Создание чат комнаты. 

-Выход (Logout).


//Коментарий к разработке
Изначально планировалось сделать авторизацию черз GitHub , для выресовки автарки мы использовали библиотеку Picaso , но в последствии отказались от идеии в качестве авторизации использовать GitHub , и перешли на авторизацию типа Email/Password , из-за проблем внесения пользователя в БД на Firebase никакой информации о методе , который позволил бы нам это сделать мы не нашли 
Но кусок авторизации через Github мы оставили (LoginActivity)


Схема переходов между Layoutam'и
https://pp.userapi.com/c850424/v850424723/94f54/JO5VG0GW-G0.jpg
