COMMANDS := $(MAKEFILE_LIST)

compile: ## Compilation du projet
		@echo "----- Debut de la compilation -----"
		@docker-compose run --rm spring mvn compile
		@echo "----- Compilation terminee -----"