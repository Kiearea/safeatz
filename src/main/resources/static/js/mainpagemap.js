document.addEventListener('DOMContentLoaded', function() {
    console.log("Document ready!");

    //map
    var mymap = L.map('mapid').setView([37.0902, -95.7129], 5);

    L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token={accessToken}', {
        attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, <a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
        maxZoom: 18,
        id: 'mapbox.streets',
        accessToken: 'pk.eyJ1IjoiZW1tYXIxMTYiLCJhIjoiY2p4NmJta3BrMDF5djRhczJkeHJpa2ZrbSJ9.cXAK6dADsONnen5z6lHKCw'
    }).addTo(mymap);

    var drawnItems = new L.FeatureGroup();
    mymap.addLayer(drawnItems);

    var drawControl = new L.Control.Draw({
        edit: {
            featureGroup: drawnItems
        }
    });

    var drawControl = new L.Control.Draw({
        edit: {
            featureGroup: drawnItems
        }
    });

    mymap.addControl(drawControl);

    /** This is handled below.
    mymap.on('draw:created', function (e) {
       var type = e.layerType,
           layer = e.layer;
       drawnItems.addLayer(layer);
    });
    */


    // Fetch pins and plot them
    fetch("/api")
    .then(r => r.json())
    .then(r => {
        r.forEach(pin => L.marker([pin.lat, pin.lng]).addTo(mymap));
    });

    // Handle New pins being dropped.
    mymap.on("draw:created", function (e) {
       var type = e.layerType,
           layer = e.layer;

       if (type === 'marker') {
           // Do marker specific actions
           var latlng = e.layer._latlng;

           $("form input[name='lat']").val(latlng.lat);
           $("form input[name='lng']").val(latlng.lng);
           $("#myModal").modal()

       var popup = L.popup();
           function onMapClick(e) {
               popup
                   .setLatLng(e.latlng)
                   .setContent("You clicked the map at " + e.latlng.toString())
                   .openOn(mymap);
           }

           mymap.on('click', onMapClick);

       }

       mymap.addLayer(layer);
    });
});

