import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {
	
	ProgramaIdade programaidade= new ProgramaIdade();
	ProgramaCPF programacpf= new ProgramaCPF();
	ProgramaNome programanome= new ProgramaNome();
	
	@Test
	void testIdade() {
		int result = programaidade.main();
		
		assertEquals(result, programaidade.main());
		
	}
	

	@Test
	
	void testCpf() {
		String result = programacpf.main();
	
		assertEquals(result, programacpf.main());
	}
	
	@Test
	
	void testNome() {
		String result = programanome.main();
		
		assertEquals(result, programanome.main());
		
	}
	
}
