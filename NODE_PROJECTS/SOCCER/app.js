const path=require('path');
const bodyParser=require('body-parser');;
const express=require('express');
const app=express();
app.use(bodyParser.urlencoded({extended: false}))
app.get('/homepage',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'Views','homepage.html'));
  

});
app.get('/add-league',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'Views','add-league.html'));
});

app.post('/add-league',(req,res,next)=>{
    console.log(req.body);
    res.redirect('/homepage');

});
app.get('/display-league',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'Views','display-league.html'));
});


/*app.use((req,res,next)=>{
res.status(400).send('<h1> page not found</h1>');

})*/


app.listen(3000);