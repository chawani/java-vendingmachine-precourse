package vendingmachine.view;

import java.util.Map;

import camp.nextstep.edu.missionutils.Console;

public class MachineView {
	private static final String INPUT_CHANGES_MESSAGE = "자판기가 보유하고 있는 금액을 입력해 주세요.";

	public String inputChanges() {
		System.out.println(INPUT_CHANGES_MESSAGE);
		return Console.readLine();
	}

	public void printChanges(Map<Integer, Integer> changesInfo) {
		System.out.println();
		System.out.println("자판기가 보유한 동전");
		for (int coin : changesInfo.keySet()) {
			System.out.println(coin + "원 - " + changesInfo.get(coin) + "개");
		}
	}

}
