package norsys.technomaker;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import norsys.technomaker.dao.PersonneDaoImp;
import norsys.technomaker.entities.Personne;

public class TestDataSet {

	@Test
	public void test() {
		PersonneDaoImp personnedao = new PersonneDaoImp();
		List<Personne> personneList = personnedao.getAllPersonnes();
		assertEquals(3, personneList.size());
		assertEquals("Ouijdane", personneList.get(3));

	}

}
