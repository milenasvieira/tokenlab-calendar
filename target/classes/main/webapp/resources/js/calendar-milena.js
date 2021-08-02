document.addEventListener('DOMContentLoaded', function () {
  var calendarEl = document.getElementById('calendar');
  var calendar = new FullCalendar.Calendar(calendarEl, {
    initialView: 'dayGridMonth',
    initialDate: '2021-07-07',
    locale: 'pt-br',
    height: 'auto' ,
    contentHeight: 'auto',
    handleWindowResize: true,
    stickyHeaderDates: true,
    bootstrapFontAwesome: true,
    themeSystem: 'standard',
    navLinks: true,
    selectable: true,
    customButtons: { createEvent: {
        text: 'Criar evento',
        click: function() {
          var dateStr = prompt('Insira uma data nesse formato YYYY-MM-DD:');
          var date = new Date(dateStr + 'T00:00:00'); // will be in local time

          if (!isNaN(date.valueOf())) { // valid?
            calendar.addEvent({
              title: 'dynamic event',
              start: date,
              allDay: true
            });
            alert('Evento criado!');
          } else {
            alert('Data inválida.');
          }
        },
        prevYear: {
          icon: 'fas fa-angle-double-left',
          click: function() {
            calendar.prevYear();
          }
        },
        nextYear: {
          icon: 'fas fa-angle-double-right',
          click: function() {
            calendar.nextYear();
          }
        }
      }
    },
    headerToolbar: {
      left: 'prevYear,prev,next,nextYear today createEvent',
      center: 'title',
      right: 'dayGridMonth,timeGridWeek,timeGridDay'
    },
    footerToolbar:{
      left: 'prevYear,prev,next,nextYear today',
      right: 'dayGridMonth,timeGridWeek,timeGridDay'
    },
    events: [{
      title: 'All Day Event',
      start: '2021-07-01'
    },
      {
        title: 'Long Event',
        start: '2021-07-07',
        end: '2021-07-10'
      },
      {
        groupId: '999',
        title: 'Repeating Event',
        start: '2021-07-09T16:00:00'
      },
      {
        groupId: '999',
        title: 'Repeating Event',
        start: '2021-07-16T16:00:00'
      },
      {
        title: 'Click for Google',
        url: 'http://google.com/',
        start: '2021-07-28'
      }]
  });
  calendar.render();
  calendar.setOption('locale', 'pt-br');
});