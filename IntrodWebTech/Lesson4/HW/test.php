<?php
$name = "Мержоева Лема";
$prof = "Программист";
$town = "Новосибирск";
$country = "Российская Федерация";
$e_mail = "l.merzhoeva@g.nsu.ru";
$tel = "+8(923)7315357";
$img = "https://sun9-44.userapi.com/s/v1/if1/Cy9MtOTA-2Eo_XlXIVXwVsYaCw1lBM-H2qgSmQrPPbGmKmWE96Jt3KXQs8ngMEia6wU978Ty.jpg?size=400x547&quality=96&crop=36,36,743,1017&ava=1";
$skills = [["name" => "C#", "value" => 70], ["name" => "Python",  "value" => 70], ["name" => "GitHub",  "value" => 60], ["name" => "SQL",  "value" => 40], ["name" => "Java",  "value" => 30], ["name" => "PHP",  "value" => 30]];
$languages = [["name" => "Английский", "value" => 50]];
$exps = [["name" => "Инженер", 
			"place" => "Новосибирский государственный университет", 
            "date_start" => "Декабрь 2022", 
            "date_end" => "Current", "description" => 'Деятельность осуществлялась в лаборатории программных систем оптимизации добычи углеводоров. В обязанности входит разработка ПО для расчета различных параметров в нефтегазовой области. В процессе деятельности был получен патент на программу для ЭВМ: "Mat-Flow – модель течения многофазного флюида в скважине"'],
		["name" => "Младший программист", 
        	"place" => "Новосибирский научно-технический центр", 
            "date_start" => "Октябрь 2022", 
            "date_end" => "Current", 
            "description" => "В обязанности входит: разработка программ прикладного назначения, составление и реализация информационных способов разрешения задач в сфере обработки информации, изучение информации, нужной для обработки вычислительной техникой и выбор способов ее хранения"],
		["name" => "Старший лаборант-исследователь", 
        	"place" => "Институт гидродинамики им. Лаврентьева", 
            "date_start" => "Ноябрь 2022", 
            "date_end" => "Current", 
            "description" => "Деятельность осуществляется в лаборатории биомеханики сплошных сред. В обязанности входит: разработка алгоритмов оптимизации расчета течения крови в сосудах, изучение информации, нужной для обработки КТ и МРТ изображений вычислительной техникой, интеграция различных API в единую систему распознавания патологических образований. В ходе деятельности выпущена статья в журнале из квартиля Q3 в Scopus, посещены конференции различных уровней: от российских студенческих до международных конференций молодых ученых."], 
        ["name" => "Преподаватель математики", 
        	"place" => "Онлайн-школа 'Maximum education'", 
            "date_start" => "Июнь 2022", 
            "date_end" => "Current", 
            "description" => "В ходе работы была осуществлена подготовка 3 групп и более 20 учеников 5-11 классов к следующим экзаменам: ВПР, ОГЭ, ЕГЭ, а также курирование в течение учебного года по стандартам школьной программы. Результатом подготовки является повышение первоначального уровня на 1-2 балла из 5 в течение полугода - года, отсутсвие несданных экзаменов у учеников."]];
$educs = [["name" => "GeekBrains", 
			"date_start" => "2023", 
            "date_end" => "2024", 
            "description" => "Курс профессиональной переподготовки: Разработчик C#. Специалитет"],
		  ["name" => "Новосибирский государственный университет", 
          		"date_start" => "2022", 
                "date_end" => "2024", 
                "description" => "Магистратура\nСпециализация: Механика и математическое моделирование"],
          ["name" => "Новосибирский государственный университет", 
          		"date_start" => "2018", 
                "date_end" => "2022", 
                "description" => "Бакалавриат\nСпециализация: Механика и математическое моделирование"]]
?>
<!DOCTYPE html>
<html>
  <head>
    <title>Резюме</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@300&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
    html,body,h1,h2,h3,h4,h5,h6 {font-family: 'Jost', sans-serif;}
    </style>
  </head>
<body class="w3-light-grey">

<!-- Page Container -->
<div class="w3-content w3-margin-top" style="max-width:1400px;">

  <!-- The Grid -->
  <div class="w3-row-padding">
  
    <!-- Left Column -->
    <div class="w3-third">
    
      <div class="w3-white w3-text-grey w3-card-4">
        <div class="w3-display-container">
          <img src="<?= $img?>" style="width:100%" alt="Avatar">
          <div class="w3-display-bottomleft w3-container w3-text-black">
            <h2 style="color: white"><?php echo $name ?></h2>
          </div>
        </div>
        <div class="w3-container">
          <p><i class="fa fa-briefcase fa-fw w3-margin-right w3-large w3-text-teal"></i><?php echo $prof ?></p>
          <p><i class="fa fa-home fa-fw w3-margin-right w3-large w3-text-teal"></i><?php echo "$town, $country" ?></p>
          <p><i class="fa fa-envelope fa-fw w3-margin-right w3-large w3-text-teal"></i><?php echo $e_mail ?></p>
          <p><i class="fa fa-phone fa-fw w3-margin-right w3-large w3-text-teal"></i><?php echo $tel ?></p>
          <hr>

          <p class="w3-large"><b><i class="fa fa-asterisk fa-fw w3-margin-right w3-text-teal"></i>Навыки</b></p>
          
          <?php foreach($skills as $skill): ?>
          
              <p><?php echo $skill["name"] ?></p>
              <div class="w3-light-grey w3-round-xlarge w3-small">
                <div class="w3-container w3-center w3-round-xlarge w3-teal" style="width:<?php echo $skill["value"] ?>%"><?php echo $skill["value"] ?>%</div>
              </div>
          
          <?php endforeach; ?>
          
              <br>

              <p class="w3-large w3-text-theme"><b><i class="fa fa-globe fa-fw w3-margin-right w3-text-teal"></i>Языки</b></p>

              <?php foreach($languages as $language): ?>

                  <p><?php echo $language["name"] ?></p>
                  <div class="w3-light-grey w3-round-xlarge">
                    <div class="w3-round-xlarge w3-teal" style="height:24px;width:<?php echo $language["value"] ?>%"></div>
                  </div>
          
          <?php endforeach; ?>
          
          <br>
        </div>
      </div><br>

    <!-- End Left Column -->
    </div>

    <!-- Right Column -->
    <div class="w3-twothird">
    
      <div class="w3-container w3-card w3-white w3-margin-bottom">
        <h2 class="w3-text-grey w3-padding-16"><i class="fa fa-suitcase fa-fw w3-margin-right w3-xxlarge w3-text-teal"></i>Опыт работы</h2>
        
        <?php foreach($exps as $exp): ?>
              <div class="w3-container">
              <h5 class="w3-opacity"><b><?php echo $exp["name"] ?></b></h5>

              <?php if ($exp["date_end"] == "Current"): ?>
                     <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i><?php echo $exp["date_start"] ?> - <span class="w3-tag w3-teal w3-round">Current</span></h6>
              <?php else: ?>
                    <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i><?php echo $exp["date_start"] ?> - <?php echo $exp["date_end"] ?></h6>
              <?php endif; ?>

              <p><?php echo $exp["description"] ?></p>
              <hr>
              </div>
		<?php endforeach; ?>
          
      </div>

      <div class="w3-container w3-card w3-white">
        <h2 class="w3-text-grey w3-padding-16"><i class="fa fa-certificate fa-fw w3-margin-right w3-xxlarge w3-text-teal"></i>Образование</h2>
        
        <?php foreach($educs as $educ): ?>
        
        	  <div class="w3-container">
              <h5 class="w3-opacity"><b><?php echo $educ["name"] ?></b></h5>
              <h6 class="w3-text-teal"><i class="fa fa-calendar fa-fw w3-margin-right"></i><?php echo $educ["date_start"] ?> - <?php echo $educ["date_end"] ?></h6>
              <p><?php echo $educ["description"] ?></p>
              <hr>
        	  </div>
              
		<?php endforeach; ?>

    <!-- End Right Column -->
    </div>
    
  <!-- End Grid -->
  </div>
  
  <!-- End Page Container -->
</div>

<!-- Footer -->
<footer class="w3-container w3-teal w3-center w3-margin-top">
  <p>Find me on social media.</p>
  <i class="fa fa-vk w3-hover-opacity"></i>
  <i class="fa fa-telegram w3-hover-opacity"></i>
 <!-- End footer -->
 </footer>

</body>
</html>
