Проверка вызова нужных методов.

При запуске приложения получаем следующие логи от методов activity

2024-02-24 19:03:15.103  5028-5028  MainActivity            com.example.businesscard             D  onCreate LOG MESSAGE

2024-02-24 19:03:15.123  5028-5028  MainActivity            com.example.businesscard             D  onStart LOG MESSAGE

2024-02-24 19:03:15.130  5028-5028  MainActivity            com.example.businesscard             D  onResume LOG MESSAGE

Согласно жизненому циклу Activity, который был представлен в видосе.
Вызываются 3 метода на создание Activity.

Сначала вызывается метод onCreate() на этом методе мы создаем нашу Activity из нашего Layot, просчитываем размер приложения, положение элементов относительно друг друга и готовимся к показу на экран пользователя.

Затем - OnStart() - Показываем наш макет пользователю, но он не может с ним взаимодействовать
и затем OnResume() - После вызова этого метода, пользователь может взаимодействовать с нашим приложением



![ЗапускПриложенияЛоги](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/530a43c4-06d3-4a4a-ab40-0ca62befad95)

При повороте экрана получаем следующие логи

2024-02-24 19:04:47.312  5028-5028  MainActivity            com.example.businesscard             D  onPause LOG MESSAGE

2024-02-24 19:04:47.323  5028-5028  MainActivity            com.example.businesscard             D  onStop LOG MESSAGE

2024-02-24 19:04:47.368  5028-5028  MainActivity            com.example.businesscard             D  onDestroy LOG MESSAGE

2024-02-24 19:04:47.590  5028-5028  MainActivity            com.example.businesscard             D  onCreate LOG MESSAGE

2024-02-24 19:04:47.611  5028-5028  MainActivity            com.example.businesscard             D  onStart LOG MESSAGE

2024-02-24 19:04:47.617  5028-5028  MainActivity            com.example.businesscard             D  onResume LOG MESSAGE

Здесь, сначала вызываются методы уничтожения нашего Activity
Сначала получаем callBack onClose() после него пользователь не может взаимодействовать с нашим приложением, т.е. он все еще видит его, но клики и свайпы не обрабатываются системой
Следующий callBack onStop() - пользователь уже не видит наше приложение
Следующий onDestroy() - завершающий callBack

Дальше вызываются 3 метода на создание Activity, как при изначальном запуске нашего приложения

![СнимокЛогиПоворот](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/13624fa2-e7b9-4ceb-ae63-8f7342d07fb4)


При сворачивании приложения получаем следующие логи

2024-02-24 19:05:50.478  5028-5028  MainActivity            com.example.businesscard             D  onPause LOG MESSAGE

2024-02-24 19:05:51.549  5028-5028  MainActivity            com.example.businesscard             D  onStop LOG MESSAGE

onPause() - пользователь больше не может взаимодействовать с нашим приложением
onStop() - пользователь больше не видит наше приложение

![СнимокСвернутьПриложение](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/ab8b0114-f523-4a3f-b913-cb4c28c961a2)



При разворачивании приложения

2024-02-24 19:06:38.540  5028-5028  MainActivity            com.example.businesscard             D  onStart LOG MESSAGE

2024-02-24 19:06:38.543  5028-5028  MainActivity            com.example.businesscard             D  onResume LOG MESSAGE

![СнимокРазворотПриложения](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/3232f587-c22e-43a7-8fde-ec04674e5c32)



onStart() - пользователь видит наше приложение
onResume() - пользователь может взаимодействовать с нашим приложением

При добавлении вызова finish() в onCreate()

2024-02-24 19:08:24.055  5588-5588  MainActivity            com.example.businesscard             D  onCreate LOG MESSAGE

2024-02-24 19:08:24.972  5588-5588  MainActivity            com.example.businesscard             D  onDestroy LOG MESSAGE

Приложение только создалось, не успело показаться пользователю, т.к. вызвался метод finish() и уничтожилось onDestroy()

![СнимокFinishвOnCreate](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/29fd803b-d6e6-4d8a-95c3-1a176a5b51eb)



