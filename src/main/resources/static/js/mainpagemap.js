var drawnItems = new L.FeatureGroup();
mymap.addLayer(drawnItems);

var drawControl = new L.Control.Draw({
edit: {
featureGroup: drawnItems
}
});

mymap.on('draw:created', function (e) {
var type = e.layerType,
layer = e.layer;
drawnItems.addLayer(layer);
});

mymap.on("draw:created", function (e) {
   var type = e.layerType,
       layer = e.layer;

   if (type === 'marker') {
       // Do marker specific actions
       var latlng = e.layer._latlng;
       $("form input[name='lat']").val(latlng.lat);
       $("form input[name='lng']").val(latlng.lng);
   }

   mymap.addLayer(layer);
   });

var drawControl = new L.Control.Draw({
    edit: {
    featureGroup: drawnItems
    }
    });
mymap.addControl(drawControl);
     mymap.on('draw:created', function (e) {
           var type = e.layerType,
               layer = e.layer;
           drawnItems.addLayer(layer);
       });


//popup
var popup = L.popup({
    maxWidth : 400
})

    .setLatLng([])
    .setContent('<img src="https://via.placeholder.com/100"/>')
    .openOn(mymap);

//L.marker([37.0902, -95.7129], {icon:pinIcon}).addTo(mymap).bindPopup(popup);