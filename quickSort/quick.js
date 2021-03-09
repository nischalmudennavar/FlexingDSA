// sequece = [10,56,23,234,2343,4663,6432135 ]

const quick=(sequence)=>{
      
    let len= sequence.length;
    if (len <= 1){
        return sequence;
    }
    else{
        var pivot = sequence.pop();
    }
    var items_lower=[], items_upper=[];
    sequence.forEach(item => {

        if(item>pivot){
            items_upper.push(item);
        }
        else{
            items_lower.push(item);
        }    
    });
    return quick(items_lower)+"_"+pivot+"_"+quick(items_upper);
}
console.log(quick([0,56,23,234,2343,4663,6432].slice()));