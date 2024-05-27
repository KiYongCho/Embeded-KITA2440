--BEGIN
--	FOR I IN 2..9 LOOP
--		FOR J IN 1..9 LOOP
--			DBMS_OUTPUT.PUT_LINE(I || ' * ' || J || ' = ' || (I*J));		
--		END LOOP;
--	END LOOP;
--END;

--1)
--BEGIN
--	FOR I IN 1..5 LOOP
--		FOR J IN 1..I LOOP
--			DBMS_OUTPUT.PUT('*');		
--		END LOOP;
--		DBMS_OUTPUT.PUT_LINE('');
--	END LOOP;
--END;

--2)
--BEGIN
--	FOR I IN 1..5 LOOP
--		FOR J IN (I+1)..5 LOOP
--			DBMS_OUTPUT.PUT('o');		
--		END LOOP;		
--		FOR J IN 1..I LOOP
--			DBMS_OUTPUT.PUT('*');		
--		END LOOP;
--		DBMS_OUTPUT.PUT_LINE('');
--	END LOOP;
--END;

--3)
--BEGIN
--	FOR I IN 1..5 LOOP
--		FOR J IN (I+1)..5 LOOP
--			DBMS_OUTPUT.PUT('o');		
--		END LOOP;
--		FOR J IN 1..(I*2-1) LOOP
--			DBMS_OUTPUT.PUT('*');		
--		END LOOP;
--		FOR J IN (I+1)..5 LOOP
--			DBMS_OUTPUT.PUT('o');		
--		END LOOP;	
--		DBMS_OUTPUT.PUT_LINE('');
--	END LOOP;
--END;

--DECLARE
--	RS SSCORE%ROWTYPE;
--	RT NUMBER;
--	CURSOR CS
--		IS
--		SELECT SNO,SNAME,SKOR,SENG,SMATH FROM SSCORE;
--BEGIN
--	OPEN CS;
--	LOOP
--		FETCH CS INTO RS;
--		RT := RS.SKOR + RS.SENG + RS.SMATH;
--		EXIT WHEN CS%NOTFOUND;
--		DBMS_OUTPUT.PUT_LINE(
--			RS.SNO || ' ' || RS.SNAME || ' ' || RS.SKOR || ' ' ||
--			RS.SENG || ' ' || RS.SMATH || ' ' || RT || ' ' || 	RT / 3
--		);
--	END LOOP;
--	CLOSE CS;	
--END;

DECLARE
	TYPE RC IS RECORD (
		SNO SSCORE.SNO%TYPE,
		SNAME SSCORE.SNAME%TYPE,
		SKOR SSCORE.SKOR%TYPE,
		SENG SSCORE.SENG%TYPE,
		SMATH SSCORE.SMATH%TYPE
	);
	TYPE AA IS TABLE OF RC INDEX BY PLS_INTEGER;
	CURSOR CS IS SELECT * FROM SSCORE;
	V_RC RC;
	V_AA AA;
	IDX PLS_INTEGER := 0;
	RT NUMBER := 0;
BEGIN
	OPEN CS;
	LOOP
		FETCH CS INTO V_RC;
		EXIT WHEN CS%NOTFOUND;
		IDX := IDX +1;		
		V_AA(IDX).SKOR := V_RC.SKOR;
		V_AA(IDX).SNAME := V_RC.SNAME;
		V_AA(IDX).SKOR := V_RC.SKOR;
		V_AA(IDX).SENG := V_RC.SENG;
		V_AA(IDX).SMATH := V_RC.SMATH;
		RT := V_RC.SKOR + V_RC.SENG + V_RC.SMATH;	
		DBMS_OUTPUT.PUT_LINE(
			V_AA(IDX).SNO || ' ' || V_AA(IDX).SNAME || ' ' || V_AA(IDX).SKOR || ' ' ||
			V_AA(IDX).SENG || ' ' || V_AA(IDX).SMATH || ' ' || RT || ' ' || 	RT / 3
		);
	END LOOP;
	CLOSE CS;
END;
















