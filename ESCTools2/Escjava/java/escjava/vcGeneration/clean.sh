#!/bin/sh

#NOTE (rg): /bin/sh is the most portable shell

# Delete files generated by javac, emacs, TeX
rm -f *~
rm -f \#* 
rm -f *.class
rm -f *.aux *.log *.pdf *.tex.backup *.toc


# Delete java files generated from j files
cat *.j | awk '/class/ {print $3".java"}' | xargs rm -f

sh help

