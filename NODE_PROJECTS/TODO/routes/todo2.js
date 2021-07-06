const {Todo, validate} = require('../models/todo1'); 
const mongoose = require('mongoose');
const express = require('express');
const router = express.Router();

router.get('/', async (req, res) => {
  const todo2 = await todo.find().sort('description');
  res.send(todo2);
});

router.post('/', async (req, res) => {
  const { error } = validate(req.body); 
  if (error) return res.status(400).send(error.details[0].message);

  let todo1 = new Todo({ 
    description: req.body.description,
    isCompleted: req.body.isCompleted,
    
  });
  todo1 = await todo1.save();
  
  res.send(todo1);
});
router.get('/:id', async (req, res) => {
  const todo1 = await Todo.findById(req.params.id)
  .catch((err)=>{
    res.status(404).send('The todo with the given ID was not found.');
  });
  if (!todo1) 
  return res.status(404).send('The todo with the given ID was not found.');

  res.send(todo1);

});
router.delete('/:id', async (req, res) => {
  const todo1 = await Todo.findByIdAndRemove(req.params.id).catch((err)=>{
    res.status(404).send('The todo with the given ID was not found.');
  });

  if (!todo1) 
    return res.status(404).send('The todo with the given ID was not found.');

  res.send(todo1);
});
router.put('/:id', async (req, res) => {
  const { error } = validate(req.body); 
  if (error) return res.status(400).send(error.details[0].message);

  const todo1 = await Todo.findByIdAndUpdate(req.params.id,
    { 
      description: req.body.description,
      isCompleted: req.body.isCompleted,
      
    }, { new: true });

  if (!todo1) return res.status(404).send('The todo with the given ID was not found.');
  
  res.send(todo1);
});




module.exports = router; 
