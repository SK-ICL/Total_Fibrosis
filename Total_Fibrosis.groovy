setImageType('BRIGHTFIELD_H_E');
setColorDeconvolutionStains('{"Name" : "H&E estimated", "Stain 1" : "Hematoxylin", "Values 1" : "0.5237 0.79993 0.29302", "Stain 2" : "Eosin", "Values 2" : "0.11171 0.94652 0.3027", "Background" : " 237 229 240"}');
createAnnotationsFromPixelClassifier("Tissue Detection", 1.0E7, 0.0, "SPLIT")
selectAnnotations();
addPixelClassifierMeasurements("Collagen_Epicardium", "Collagen_Epicardium")
