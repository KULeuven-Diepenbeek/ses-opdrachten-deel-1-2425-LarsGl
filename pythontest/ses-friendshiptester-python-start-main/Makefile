compile:
	@echo "compiling ..."
	pyinstaller --onefile --name app.bin app.py
	@echo "Done compiling."

run:
	@echo "running ..."
	./dist/app.bin

clean:
	@echo "cleaning ..."
	rm -rf build dist app.bin.spec
	@echo "Done cleaning."
test:
	@echo "testing ..."
	python3 app.py
	@echo "Done testing."