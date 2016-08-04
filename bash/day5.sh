#!/bin/bash
read n
for i in `seq 1 10`
do
  let result=n*i
  echo "$n x $i = $result"
done
