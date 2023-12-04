import random

nombres = ["Juan", "David", "Pablo", "Andrea", "Anthony", "Valeria", "Manuel", "Mateo", "José", "Carla", "Sara", "Xavier", "Maria", "Daniel", "Arelis"]
apellidos = ["Landi", "Álvares", "Bustamante", "Pauta", "Cueva", "Valdiviezo", "Valverde", "Cuenca", "Gonzáles", "Ruíz", "Chávez", "Palacios", "Zapata", "Ordóñez", "Salinas"]

def generar_estudiante():
    nombre = random.choice(nombres)
    apellido = random.choice(apellidos)
    
    cedula = str(random.randint(1000000,9999999))
    return [nombre + " " + apellido, cedula]

def generar_materia():

    materia = "Estructuras Discretas"
    
    acd = round(random.uniform(0,3.5),1)
    ape = round(random.uniform(0,3.5),1)
    aa = round(random.uniform(0,3),1)


    return [materia, acd, ape, aa]
def promedio(acd,ape,aa):
    total = acd + ape + aa
    total=total/3
    return total

def verificar_aprobacion(acd,ape,aa):
    total = acd + ape + aa
    if total >= 7:
        return total
    else:
        return 0
    

def examen_recuperacion(acd,ape,aa):
    total = acd + ape + aa
    total1 = total *0.6
    return total1

alumnos = int (input("Cuantos estudiantes desea ingresar: "))
aprobados, reprobados = 0, 0
for _ in range(alumnos):
    
    estudiante = generar_estudiante()  
    print(f"Estudiante: {estudiante[0]}, Cédula: 110{estudiante[1]}")
    

    materia = generar_materia()
    print(f"Materia: {materia[0]}") 
    print(f"ACD: {materia[1]} APE: {materia[2]} AA: {materia[3]}")

    if verificar_aprobacion(materia[1],materia[2],materia[3]):
        print("Resultado: Aprobado")
        aprobados += 1 
    else:
        print("Resultado: Reprobado")  
        print(f"Deberá rendir un examen de recuperación sobre 3.5/10 pts. su nota acumulada es de: {examen_recuperacion(materia[1],materia[2],materia[3])}")
        reprobados += 1
aprobados = aprobados * 100 / alumnos
reprobados = reprobados * 100 / alumnos

print(f"Aprobados: {aprobados}%")
print(f"Reprobados: {reprobados}%")