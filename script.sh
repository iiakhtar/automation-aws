!#/bin/bash
mkdir cloneRepos
cd cloneRepos
git clone https://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@github.com/iiakhtar/automation-aws
echo $HELLO
robot --outputdir tmp ./automation-aws/About.robot