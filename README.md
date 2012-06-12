CS499Summer2012
===============

Android App development project CS 499 Summer 2012

Proposed organization of the repository:
(following a simple version of this model http://nvie.com/posts/a-successful-git-branching-model/)

1. master (permanent)

Main branch, code here always reflects a production-ready state. There should be no direct commits to this branch. It should only be merged from origin/develop.

2. develop (permanent)

Develop branch, code here reflects with the latest developmental changes. There should be no direct commits to this branch. It should only be merged from our individual development branches.

3. james-dev & jon-dev (permanent)

Individual branches where we will work on specific features and push commits of our work in progress. When a feature is finished, it can be merged into the develop branch.

4. hotfix branches (temporary)

Only needed if a problem is discovered in develop or master that needs an immediate fix. After the fix is implemented and merged, the branch can be deleted.