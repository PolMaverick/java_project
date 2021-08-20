<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['점수', '공부시간'],
          [ 90,      12],
          [ 84,      13],
          [ 71,     9],
          [ 45,      5],
          [ 57,      7],
          [ 76,    9]
        ]);

        var options = {
          title: '점수 vs. 공부시간 비교',
          hAxis: {title: '점수', minValue: 40, maxValue: 100},
          vAxis: {title: '공부시간', minValue: 5, maxValue: 15},
          legend: 'none'
        };

        var chart = new google.visualization.ScatterChart(document.getElementById('chart_div'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="chart_div" style="width: 900px; height: 500px;"></div>
  </body>
</html>