
(("name" . "csha256")
("version" . "0.1.0")
("description" . "SHA256 for Chez Scheme")
("keywords")
("author" 
    ("Ilya O. Levin" "guenchi"))
("private" . #f)
("scripts" 
    ("build" . "cd ./lib/csha256/src && cc -o3 -fPIC -shared sha256.c -o ../sha256.so"))
("dependencies")
("devDependencies"))
