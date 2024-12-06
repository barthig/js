Hibernate:
insert
into
triangle
(a, b, c, red, green, blue, alpha, name)
values
(?, ?, ?, ?, ?, ?, ?, ?)
Hibernate:
insert
into
rectangle
(red, green, blue, alpha, height, name, witdh)
values
(?, ?, ?, ?, ?, ?, ?)
Hibernate:
insert
into
circle
(red, green, blue, alpha, name, radius)
values
(?, ?, ?, ?, ?, ?)
pobrane figury
Hibernate:
select
t1_0.id,
t1_0.a,
t1_0.b,
t1_0.c,
t1_0.red,
t1_0.green,
t1_0.blue,
t1_0.alpha,
t1_0.name
from
triangle t1_0
where
t1_0.id=?
Hibernate:
select
r1_0.id,
r1_0.red,
r1_0.green,
r1_0.blue,
r1_0.alpha,
r1_0.height,
r1_0.name,
r1_0.witdh
from
rectangle r1_0
where
r1_0.id=?
Hibernate:
select
c1_0.id,
c1_0.red,
c1_0.green,
c1_0.blue,
c1_0.alpha,
c1_0.name,
c1_0.radius
from
circle c1_0
where
c1_0.id=?
org.example.Triangle@482c351d
org.example.Rectangle@7ddcb0dc
org.example.Circle@3e856100
Hibernate:
update
triangle
set
a=?,
b=?,
c=?,
red=?,
green=?,
blue=?,
alpha=?,
name=?
where
id=?
Hibernate:
update
rectangle
set
red=?,
green=?,
blue=?,
alpha=?,
height=?,
name=?,
witdh=?
where
id=?
Hibernate:
update
circle
set
red=?,
green=?,
blue=?,
alpha=?,
name=?,
radius=?
where
id=?

po uaktualnieniu
Hibernate:
select
t1_0.id,
t1_0.a,
t1_0.b,
t1_0.c,
t1_0.red,
t1_0.green,
t1_0.blue,
t1_0.alpha,
t1_0.name
from
triangle t1_0
where
t1_0.id=?
Hibernate:
select
r1_0.id,
r1_0.red,
r1_0.green,
r1_0.blue,
r1_0.alpha,
r1_0.height,
r1_0.name,
r1_0.witdh
from
rectangle r1_0
where
r1_0.id=?
Hibernate:
select
c1_0.id,
c1_0.red,
c1_0.green,
c1_0.blue,
c1_0.alpha,
c1_0.name,
c1_0.radius
from
circle c1_0
where
c1_0.id=?
UpdatedTriangleareaNaN, perimeter: 18.0
UpdatedRectangle area30.0, perimeter:22.0
UpdatedCircle area 78.53981633974483, perimeter:31.41592653589793

po usuwanie figur
Hibernate:
delete
from
triangle
where
id=?
Hibernate:
delete
from
rectangle
where
id=?
Hibernate:
delete
from
circle
where
id=?

potwierdzenie po usuwaniu figur
Hibernate:
select
t1_0.id,
t1_0.a,
t1_0.b,
t1_0.c,
t1_0.red,
t1_0.green,
t1_0.blue,
t1_0.alpha,
t1_0.name
from
triangle t1_0
where
t1_0.id=?
Hibernate:
select
r1_0.id,
r1_0.red,
r1_0.green,
r1_0.blue,
r1_0.alpha,
r1_0.height,
r1_0.name,
r1_0.witdh
from
rectangle r1_0
where
r1_0.id=?
Hibernate:
select
c1_0.id,
c1_0.red,
c1_0.green,
c1_0.blue,
c1_0.alpha,
c1_0.name,
c1_0.radius
from
circle c1_0
where
c1_0.id=?
traingle deleted
rectangle deleted
circle deleted

Process finished with exit code 0


<table class="coverage" cellspacing="0" id="coveragetable">
  <thead>
    <tr>
      <td class="up sortable" id="a" onclick="toggleSort(this)">Element</td>
      <td class="sortable bar" id="b" onclick="toggleSort(this)">Missed Instructions</td>
      <td class="sortable ctr2" id="c" onclick="toggleSort(this)">Cov.</td>
      <td class="sortable bar" id="d" onclick="toggleSort(this)">Missed Branches</td>
      <td class="sortable ctr2" id="e" onclick="toggleSort(this)">Cov.</td>
      <td class="sortable ctr1" id="f" onclick="toggleSort(this)">Missed</td>
      <td class="sortable ctr2" id="g" onclick="toggleSort(this)">Cxty</td>
      <td class="sortable ctr1" id="h" onclick="toggleSort(this)">Missed</td>
      <td class="sortable ctr2" id="i" onclick="toggleSort(this)">Lines</td>
      <td class="sortable ctr1" id="j" onclick="toggleSort(this)">Missed</td>
      <td class="sortable ctr2" id="k" onclick="toggleSort(this)">Methods</td>
      <td class="sortable ctr1" id="l" onclick="toggleSort(this)">Missed</td>
      <td class="sortable ctr2" id="m" onclick="toggleSort(this)">Classes</td>
    </tr>
  </thead>
  <tfoot>
    <tr>
      <td>Total</td>
      <td class="bar">65 of 615</td>
      <td class="ctr2">89%</td>
      <td class="bar">16 of 20</td>
      <td class="ctr2">20%</td>
      <td class="ctr1">15</td>
      <td class="ctr2">59</td>
      <td class="ctr1">22</td>
      <td class="ctr2">165</td>
      <td class="ctr1">5</td>
      <td class="ctr2">49</td>
      <td class="ctr1">0</td>
      <td class="ctr2">7</td>
    </tr>
  </tfoot>
  <tbody>
    <tr>
      <td id="a0">
        <a href="http://localhost:63342/js/lab_4/target/site/jacoco/org.example/index.html#up-a" class="el_package">org.example</a>
      </td>
      <td class="bar" id="b0">
        <img src="jacoco-resources/redbar.gif" width="12" height="10" title="65" alt="65">
        <img src="jacoco-resources/greenbar.gif" width="107" height="10" title="550" alt="550">
      </td>
      <td class="ctr2" id="c0">89%</td>
      <td class="bar" id="d0">
        <img src="jacoco-resources/redbar.gif" width="96" height="10" title="16" alt="16">
        <img src="jacoco-resources/greenbar.gif" width="24" height="10" title="4" alt="4">
      </td>
      <td class="ctr2" id="e0">20%</td>
      <td class="ctr1" id="f0">15</td>
      <td class="ctr2" id="g0">59</td>
      <td class="ctr1" id="h0">22</td>
      <td class="ctr2" id="i0">165</td>
      <td class="ctr1" id="j0">5</td>
      <td class="ctr2" id="k0">49</td>
      <td class="ctr1" id="l0">0</td>
      <td class="ctr2" id="m0">7</td>
    </tr>
  </tbody>
</table>