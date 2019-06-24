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