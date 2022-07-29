#!/bin/bash

cd desktop/vs_code
# cd $(dirname ${BASH_SOURCE[0]})


while true
do  
    # echo "root@2022" | sudo -S -k purge
    sleep 120
    if [[ -n $(git status -s) ]]; then
        echo "Changes found. Pushing changes..."
        git add -A && git commit -m 'update' && git push
    else
        echo "No changes found. Skip pushing."
    fi
done