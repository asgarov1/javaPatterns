I don't like this pattern - Cloning an object can get complicated and backfire very fast. Since default 
behaviour of Object.clone performs only shallow copying (fields refernce same Objects as in the original) 
you need to either recursively call clone() on every non primitive field or instantiate a copy of them 
which kind of beats the point...? And what if one of the fields is a Collection? 
Then again recreate every element in that collection...

Simply creating a copy via constructors seems much easier and also will be much clearer in code... It has to be one 
hell of an expensive object to create in order to justify prototyping. But then again expensive objects are usually full
of Collections.