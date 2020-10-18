$(document).ready(function () {
    let btnUcitaj = $("#btnUcitaj");
    let btnUnesi = $("#btnUnesiBend");
    let urll = 'http://localhost:8080/api/';
    //let urll = 'https://jsonplaceholder.typicode.com/posts';
    let temp = $("#templ").html();

    function addBend(data) {
        //lista.append(`<li>${"Bend: " + data.id+ ' ' + data.naziv}</li>
        //<button>X</button><button>edit</button><input type="text">`
        lista.append(Mustache.render(temp,data))
    }

    let lista = $("#lista");
    //GET
    //btnUcitaj.click(function () {
        //AJAX-asihroni(bez da se refresh stranica)

        $.ajax({
            url:urll+'all',
            success:function (data) {
                //console.log(data)
                $.each(data, function (kljuc, v) {
                    addBend(v);
                    //lista.append('<li>Bend: '+v.id+ '   '+v.naziv+'</li>')
                    //lista.append(`<li>${v.naziv}</li>`)
                    //$("#myLista").append('<p><strong>Status: </strong>'+v.title+'</p>')
                })
            }
        })
    //})
    //POST
    btnUnesi.click(function () {
        let unos = $("#txtUnos").val();
        //console.log(unos.val());
        $.ajax( {
            url: urll+'add',
            type: "POST",
            contentType:'application/JSON',
            data: JSON.stringify(unos),
            success:function (d) {
                //console.log(d)
                //lista.append(`<li>${d.naziv}</li>`)
                addBend(d);
            },
            error:function () {
                alert('pograška');
            }
        })
    })

    //DELETE
    lista.delegate('.delete','click', function () {
        let id=$(this).attr('data-id');
        let li=$(this).closest('li');
        $.ajax({
            url: urll+'del/'+id,
            type: 'DELETE',
            success:function () {
                li.remove()
            }
        })
    })

    //edit mode
    lista.delegate('.btnEdit', 'click', function () {
        let li=$(this).closest('li');
        li.addClass('edit');
        let starinNaziv = li.find('strong').html();
        $('.txtNaziv').val(starinNaziv);
    })
    //cancle mode
    lista.delegate('.cancle', 'click', function () {
        let li=$(this).closest('li');
        li.removeClass('edit');
    })
    //save--PUT
    lista.delegate('.save', 'click', function () {
        let li=$(this).closest('li');
        let noviNaziv = li.find('input.txtNaziv').val();
        let id=$(this).attr('data-id');
        //console.log(noviNaziv);
        let updatenBend={
            id:id,
            naziv:noviNaziv
        }
        $.ajax( {
            url:urll+'update',
            type:'PUT',
            contentType:'application/JSON',
            data: JSON.stringify(updatenBend),
            success:function (d) {
                li.removeClass('edit'),
                //li.find('strong').html(noviNaziv)
                li.find('strong').html(d.naziv)
            },
            error:function () {
                alert('pograška');
            }
        })
    })
})