# Parcial Segundo Corte
### Integrantes: Sebastian Rojas, Julia Mejia  

## PUNTO 1
Para resolver este punto, se realizó la consulta de la historia de usuario numero 1 
<img width="543" alt="image" src="https://user-images.githubusercontent.com/98657146/200155276-9eb8743e-d419-4b2d-92a1-a65c1748b27a.png">  
y se realizó el siguiente test, el cual usa la consulta anterior 
<img width="631" alt="image" src="https://user-images.githubusercontent.com/98657146/200155316-dfc65bdf-1e2a-4423-a0b7-af3ff74f7c50.png">  
despues de correrla, vemos que pasa satisfactoriamente  
![image](https://user-images.githubusercontent.com/98657146/200155326-478b892d-96ab-429d-8167-5f8892c58a69.png)



## PUNTO 2 Y 3 

Para realizar el parcial seguimos los pasos para la Integración de Capas con Google Guice usando el Framework de Persistencia MyBatis

1. **Entidades**   
por parte de las entidades que son archivos.java tenemos:  
<img width="220" alt="image" src="https://user-images.githubusercontent.com/98657146/200152837-d1d6d141-9951-4e6e-a27d-2dce9af5adbd.png">  
Que contienen los get y set de los datos de consulta y paciente  
y en TipoIdentificación están los tipos de identificación que existen y que son validos para pedir una consulta  
  
  
2. **Interface del mapper**     
Para cumplir este paso tenemos la clase PacienteMapper en la que se obtiene la lista de los pacientes definidos en cada historia de usuario 
<img width="219" alt="image" src="https://user-images.githubusercontent.com/98657146/200152948-c6e6fae0-8f19-45b8-a518-4c7f1943b62e.png">
<img width="581" alt="image" src="https://user-images.githubusercontent.com/98657146/200153364-ad640a84-1f55-455c-9075-d622e659a2a4.png">


3. **Mapper.xml**    
Tenemos PacienteMapper.xml la cual contiene los resultMap y el id(que es el nombre del metodo en la interfaz, en este caso : getPacientesById) y las consultas 
### Para la historia de usuario1:  
<img width="443" alt="image" src="https://user-images.githubusercontent.com/98657146/200153855-97b2666e-4fed-4fbf-89a1-fb727941ac93.png">
<img width="546" alt="image" src="https://user-images.githubusercontent.com/98657146/200153864-3fc5d735-f807-408b-8c6e-89b3a2041d87.png">

### Para la historia de usuario2:  
<img width="596" alt="image" src="https://user-images.githubusercontent.com/98657146/200153878-f872fdfc-8a65-457b-ba30-230a98a932a4.png">
<img width="518" alt="image" src="https://user-images.githubusercontent.com/98657146/200153884-98691e37-13ce-4dbb-a5a3-c60d80e7d499.png">  

4. **Interfaz para el contenedor**  
Tenemos la clase MyBatisDAOPaciente a la cual agregamos un metodo que obtiene los menores contagiados
<img width="604" alt="image" src="https://user-images.githubusercontent.com/98657146/200154370-ef356de1-2e8c-4f5d-bb2a-a22f02539888.png">

5. **Contenedor my Batis**  
Tenemos DaoPaciente que implementa los metodos de la interfaz para el contenedor (MyBatisDaoPaciente)
<img width="209" alt="image" src="https://user-images.githubusercontent.com/98657146/200154535-48414ac8-b245-47ad-8b2f-97297e136b9a.png">

6. **Servicio**  
Tenemos las clases servicioPaciente y servicioPacienteFactory las cuales no se modificaron 
<img width="220" alt="image" src="https://user-images.githubusercontent.com/98657146/200154697-4f24928f-ec56-4319-891e-28184ce013d4.png">

7. **managedbeans**  
Tenemos PacientesBean a  la cual se le agregaron los siguientes metodos 
<img width="622" alt="image" src="https://user-images.githubusercontent.com/98657146/200154897-ec439ae0-db20-41e3-baae-02d57c58527a.png">

8. **archivo.xhtml**    
para cada historia de usuario se tiene un archivo xhtml 
<img width="246" alt="image" src="https://user-images.githubusercontent.com/98657146/200154943-ae71e3e0-6a0c-4118-8f24-de8707903722.png">

### Para la historia de usuario1:  

junto con los datos que da la consulta1 , se agregan las columnas con sus respectivos valores, los titulos y todo lo visual que tiene la pagina 
<img width="641" alt="image" src="https://user-images.githubusercontent.com/98657146/200154957-bf32dc00-81c5-4e98-9ed3-e3a1c1926381.png">
<img width="625" alt="image" src="https://user-images.githubusercontent.com/98657146/200154969-2109df6a-669f-405e-8ea6-eca4e2f77535.png">

### Para la historia de usuario2:  
junto con los datos que da la consulta2 , se agregan las columnas con sus respectivos valores, los titulos y todo lo visual que tiene la pagina  
<img width="617" alt="image" src="https://user-images.githubusercontent.com/98657146/200155006-b654ece3-41b7-4f8b-8fdf-ff4a16d2c66e.png">

Por ultimo probamos cada consulta con la url de localhost 

### Para la historia de usuario1:  
http://localhost:8080/faces/consultaPaciente.xhtml
![image](https://user-images.githubusercontent.com/98657146/200155103-b2d34d39-bec1-489b-a65f-b8560d98b8cd.png)
![image](https://user-images.githubusercontent.com/98657146/200155106-e3309c65-4228-4260-a6fa-fe9c1081df19.png)

### Para la historia de usuario2:
http://localhost:8080/faces/consultarMenoresEnfermedadContagiosa.xhtml
![image](https://user-images.githubusercontent.com/98657146/200155138-3183fab3-2687-446b-9f41-f66833603ae8.png)















