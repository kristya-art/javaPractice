//remove an element from array using Array.filter
function removeNumber(array, value) {

    return array.filter(function(ele){
        return ele != value; //return elements not matching a value.
    });
}
 var array  = [1,2,3,4,7];
var result = removeNumber(array, 7);

console.log(result);  // ->> output [ 1, 2, 3, 4 ]
