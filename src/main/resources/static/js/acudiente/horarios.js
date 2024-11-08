$(document).ready(function () {
    $('select').selectpicker();
    $('#cursoEstu').prop('hidden', true);
    $('#estudiantesSelect').change(function () {

        var url = "horarios/" + $(this).val();
        $('#horarioEst').load(url, function () {
            $('#cursoEstu').prop('hidden', false);
        });
    })

    let unicoEstudiante = $("#unicoEstudiante").val();
    if (unicoEstudiante > 0) {
        $("#estudiantesSelect").prop("selectedIndex", 1);
        $("#estudiantesSelect").selectpicker("refresh");

        var url = "horarios/" + unicoEstudiante;
        $('#horarioEst').load(url, function () {
            $('#cursoEstu').prop('hidden', false);
        });
    }
});

function infoMateria(idHorario, nombreMateria, dia, horaInicio, horaFin, nombresProfesor, apellidosProfesor, descMateria, nombreCurso) {
    //alert(nombreCurso);
    $("#infoIdHorario").val(idHorario);
    $("#infoNombreMateria").html(nombreMateria);
    $("#infoDiaHora").html(dia + ' | ' + horaInicio + ' - ' + horaFin);
    $("#infoNombreProfesor").html(nombresProfesor + " " + apellidosProfesor);
    $("#infoDescMateria").html(descMateria);
    $("#infoCurso").html(nombreCurso);
    $('#modalInfoMaterias').modal();
}

