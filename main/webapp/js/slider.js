$(document).ready(function(){
    let slika1 = $("#slika1");
    let slika2 = $("#slika2");
    let slika3 = $("#slika3");
    let lijevo = $("#lijevo");
    let desno = $("#desno");
    let counter = 0;
    slika2.hide();
    slika3.hide();


    lijevo.click(function () {
        console.log(counter);
        if (counter == 0) {
            slika1.hide();
            slika2.show();
        } else if (counter == 1) {
            slika2.hide();
            slika3.show();
        } else {
            slika1.show()
            slika3.hide()
        }
        counter++;
        if(counter>2)
            counter=0;
    });

    desno.click(function () {
        console.log(counter);
        if (counter == 0) {
            slika1.hide();
            slika2.show();
        } else if (counter == 1) {
            slika2.hide();
            slika3.show();
        } else {
            slika1.show()
            slika3.hide()
        }
        counter++;
        if(counter>2)
            counter=0;
    })
});
