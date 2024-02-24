// Проверка вызова нужных методов.

При запуске приложения получаем следующие логи от методов activity

2024-02-24 22:06:58.576  5776-5776  MainActivity            com.example.businesscard             D  onCreate LOG MESSAGE

2024-02-24 22:06:58.594  5776-5776  MainActivity            com.example.businesscard             D  onStart LOG MESSAGE

2024-02-24 22:06:58.600  5776-5776  MainActivity            com.example.businesscard             D  onResume LOG MESSAGE

Согласно жизненому циклу Activity, который был представлен в видосе.
Вызываются 3 метода на создание Activity.

Сначала вызывается метод onCreate() на этом методе мы создаем нашу Activity из нашего Layot, просчитываем размер приложения, положение элементов относительно друг друга и готовимся к показу на экран пользователя.

Затем - OnStart() - Показываем наш макет пользователю, но он не может с ним взаимодействовать
и затем OnResume() - После вызова этого метода, пользователь может взаимодействовать с нашим приложением

![ЗапускПриложенияЛоги](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/86cc6a96-6cfc-4c5b-91aa-124469790efb)



// При повороте экрана получаем следующие логи

2024-02-24 22:07:57.909  5776-5776  MainActivity            com.example.businesscard             D  onPause LOG MESSAGE

2024-02-24 22:07:57.930  5776-5776  MainActivity            com.example.businesscard             D  onStop LOG MESSAGE

2024-02-24 22:07:58.028  5776-5776  MainActivity            com.example.businesscard             D  onDestroy LOG MESSAGE

2024-02-24 22:07:58.489  5776-5776  MainActivity            com.example.businesscard             D  onCreate LOG MESSAGE

2024-02-24 22:07:58.499  5776-5776  MainActivity            com.example.businesscard             D  onStart LOG MESSAGE

2024-02-24 22:07:58.518  5776-5776  MainActivity            com.example.businesscard             D  onResume LOG MESSAGE

Здесь, сначала вызываются методы уничтожения нашего Activity
Сначала получаем callBack onClose() после него пользователь не может взаимодействовать с нашим приложением, т.е. он все еще видит его, но клики и свайпы не обрабатываются системой
Следующий callBack onStop() - пользователь уже не видит наше приложение
Следующий onDestroy() - завершающий callBack

Дальше вызываются 3 метода на создание Activity, как при изначальном запуске нашего приложения

![СнимокЛогиПоворот](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/a9d9bab7-3703-476e-991b-8d20de57a4a7)



// При сворачивании приложения получаем следующие логи

2024-02-24 22:09:31.786  5776-5776  MainActivity            com.example.businesscard             D  onPause LOG MESSAGE

2024-02-24 22:09:32.861  5776-5776  MainActivity            com.example.businesscard             D  onStop LOG MESSAGE

onPause() - пользователь больше не может взаимодействовать с нашим приложением
onStop() - пользователь больше не видит наше приложение

![СнимокСвернутьПриложение](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/73831ed2-bbe9-4582-9adf-3d5a4972b950)



// При разворачивании приложения

2024-02-24 22:10:09.348  5776-5776  MainActivity            com.example.businesscard             D  onRestart LOG MESSAGE

2024-02-24 22:10:09.349  5776-5776  MainActivity            com.example.businesscard             D  onStart LOG MESSAGE

2024-02-24 22:10:09.351  5776-5776  MainActivity            com.example.businesscard             D  onResume LOG MESSAGE

onRestart() - обычно используется для восстановления состояния приложения, которое могло изменится во время остановки
onStart() - пользователь видит наше приложение
onResume() - пользователь может взаимодействовать с нашим приложением


![СнимокРазворотПриложения](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/8ef5b0cf-5a10-45f1-b7c1-8fb4573943fc)



// При добавлении вызова finish() в onCreate()

2024-02-24 22:13:06.555  5954-5954  MainActivity            com.example.businesscard             D  onCreate LOG MESSAGE

2024-02-24 22:13:07.437  5954-5954  MainActivity            com.example.businesscard             D  onDestroy LOG MESSAGE

Приложение только создалось, не успело показаться пользователю, т.к. вызвался метод finish() и уничтожилось onDestroy()

![СнимокFinishвOnCreate](https://github.com/Ziklson/AndroidMarathon-Activity/assets/96010534/1dbf673a-d8b3-4513-b036-01c62e2ba374)


