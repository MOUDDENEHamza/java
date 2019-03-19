#!/bin/sh

if [ $# -ne 0 ] ; then
	echo "ERROR : Wrong usage\nUsage : $0" >&2
		exit 1
fi

git add .
read -p "Enter the message to set up the commit : " message;
git commit -m "$$message"
git push
