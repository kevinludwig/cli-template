### Overview
A basic clojure web app skeleton

### Setup

Install leiningen: `brew install leiningen`

Fetch Dependencies: `lein deps`

Fire it up: `ring server-headless 3000`

### Plugin usage

* Run tests: `lein midje`
* View coverage `lein cloverage`
* Lint files: `lein eastwood`
* Beautify: `lein cljfmt check` (or `lein cljfmt fix`)
* Check for outdated dependencies: `lein ancient`
* Check for code simplifications: `lein kibit`

### Docker

`docker-compose build && docker-compose up`

